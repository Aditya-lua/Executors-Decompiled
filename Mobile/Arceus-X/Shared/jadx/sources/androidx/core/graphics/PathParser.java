package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PathParser {
    private static final String LOGTAG = "PathParser";

    static float[] copyOfRange(float[] original, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int originalLength = original.length;
        if (start < 0 || start > originalLength) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int resultLength = end - start;
        int copyLength = Math.min(resultLength, originalLength - start);
        float[] result = new float[resultLength];
        System.arraycopy(original, start, result, 0, copyLength);
        return result;
    }

    public static Path createPathFromPathData(String pathData) {
        Path path = new Path();
        PathDataNode[] nodes = createNodesFromPathData(pathData);
        if (nodes != null) {
            try {
                PathDataNode.nodesToPath(nodes, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException("Error in parsing " + pathData, e10);
            }
        }
        return null;
    }

    public static PathDataNode[] createNodesFromPathData(String pathData) {
        if (pathData == null) {
            return null;
        }
        int start = 0;
        int end = 1;
        ArrayList<PathDataNode> list = new ArrayList<>();
        while (end < pathData.length()) {
            int end2 = nextStart(pathData, end);
            String s8 = pathData.substring(start, end2).trim();
            if (s8.length() > 0) {
                float[] val = getFloats(s8);
                addNode(list, s8.charAt(0), val);
            }
            start = end2;
            end = end2 + 1;
        }
        if (end - start == 1 && start < pathData.length()) {
            addNode(list, pathData.charAt(start), new float[0]);
        }
        return (PathDataNode[]) list.toArray(new PathDataNode[list.size()]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] source) {
        if (source == null) {
            return null;
        }
        PathDataNode[] copy = new PathDataNode[source.length];
        for (int i10 = 0; i10 < source.length; i10++) {
            copy[i10] = new PathDataNode(source[i10]);
        }
        return copy;
    }

    public static boolean canMorph(PathDataNode[] nodesFrom, PathDataNode[] nodesTo) {
        if (nodesFrom == null || nodesTo == null || nodesFrom.length != nodesTo.length) {
            return false;
        }
        for (int i10 = 0; i10 < nodesFrom.length; i10++) {
            if (nodesFrom[i10].mType != nodesTo[i10].mType || nodesFrom[i10].mParams.length != nodesTo[i10].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] target, PathDataNode[] source) {
        for (int i10 = 0; i10 < source.length; i10++) {
            target[i10].mType = source[i10].mType;
            for (int j10 = 0; j10 < source[i10].mParams.length; j10++) {
                target[i10].mParams[j10] = source[i10].mParams[j10];
            }
        }
    }

    private static int nextStart(String s8, int end) {
        while (end < s8.length()) {
            char c10 = s8.charAt(end);
            if (((c10 - 'A') * (c10 - 'Z') <= 0 || (c10 - 'a') * (c10 - 'z') <= 0) && c10 != 'e' && c10 != 'E') {
                return end;
            }
            end++;
        }
        return end;
    }

    private static void addNode(ArrayList<PathDataNode> list, char cmd, float[] val) {
        list.add(new PathDataNode(cmd, val));
    }

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private static float[] getFloats(String s8) {
        if (s8.charAt(0) == 'z' || s8.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] results = new float[s8.length()];
            int count = 0;
            int startPosition = 1;
            ExtractFloatResult result = new ExtractFloatResult();
            int totalLength = s8.length();
            while (startPosition < totalLength) {
                extract(s8, startPosition, result);
                int endPosition = result.mEndPosition;
                if (startPosition < endPosition) {
                    results[count] = Float.parseFloat(s8.substring(startPosition, endPosition));
                    count++;
                }
                if (result.mEndWithNegOrDot) {
                    startPosition = endPosition;
                } else {
                    startPosition = endPosition + 1;
                }
            }
            return copyOfRange(results, 0, count);
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + s8 + "\"", e10);
        }
    }

    private static void extract(String s8, int start, ExtractFloatResult result) {
        boolean foundSeparator = false;
        result.mEndWithNegOrDot = false;
        boolean secondDot = false;
        boolean isExponential = false;
        for (int currentIndex = start; currentIndex < s8.length(); currentIndex++) {
            boolean isPrevExponential = isExponential;
            isExponential = false;
            char currentChar = s8.charAt(currentIndex);
            switch (currentChar) {
                case ' ':
                case ',':
                    foundSeparator = true;
                    break;
                case '-':
                    if (currentIndex != start && !isPrevExponential) {
                        foundSeparator = true;
                        result.mEndWithNegOrDot = true;
                    }
                    break;
                case '.':
                    if (!secondDot) {
                        secondDot = true;
                    } else {
                        foundSeparator = true;
                        result.mEndWithNegOrDot = true;
                    }
                    break;
                case 'E':
                case 'e':
                    isExponential = true;
                    break;
            }
            if (foundSeparator) {
                result.mEndPosition = currentIndex;
            }
        }
        result.mEndPosition = currentIndex;
    }

    public static class PathDataNode {

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public float[] mParams;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public char mType;

        PathDataNode(char type, float[] params) {
            this.mType = type;
            this.mParams = params;
        }

        PathDataNode(PathDataNode n10) {
            this.mType = n10.mType;
            float[] fArr = n10.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        public static void nodesToPath(PathDataNode[] node, Path path) {
            float[] current = new float[6];
            char previousCommand = 'm';
            for (int i10 = 0; i10 < node.length; i10++) {
                addCommand(path, current, previousCommand, node[i10].mType, node[i10].mParams);
                previousCommand = node[i10].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode nodeFrom, PathDataNode nodeTo, float fraction) {
            int i10 = 0;
            while (true) {
                float[] fArr = nodeFrom.mParams;
                if (i10 < fArr.length) {
                    this.mParams[i10] = (fArr[i10] * (1.0f - fraction)) + (nodeTo.mParams[i10] * fraction);
                    i10++;
                } else {
                    return;
                }
            }
        }

        private static void addCommand(Path path, float[] current, char previousCmd, char cmd, float[] val) {
            int incr;
            int k10;
            float reflectiveCtrlPointX;
            float reflectiveCtrlPointY;
            float reflectiveCtrlPointX2;
            float reflectiveCtrlPointY2;
            Path path2 = path;
            float currentX = current[0];
            float currentY = current[1];
            float ctrlPointX = current[2];
            float ctrlPointY = current[3];
            float currentSegmentStartX = current[4];
            float currentSegmentStartY = current[5];
            switch (cmd) {
                case 'A':
                case 'a':
                    incr = 7;
                    break;
                case 'C':
                case 'c':
                    incr = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    incr = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    incr = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    incr = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    currentX = currentSegmentStartX;
                    currentY = currentSegmentStartY;
                    ctrlPointX = currentSegmentStartX;
                    ctrlPointY = currentSegmentStartY;
                    path2.moveTo(currentX, currentY);
                    incr = 2;
                    break;
                default:
                    incr = 2;
                    break;
            }
            char previousCmd2 = previousCmd;
            int k11 = 0;
            float currentX2 = currentX;
            float ctrlPointX2 = ctrlPointX;
            float ctrlPointY2 = ctrlPointY;
            float currentSegmentStartX2 = currentSegmentStartX;
            float currentSegmentStartY2 = currentSegmentStartY;
            float currentSegmentStartY3 = currentY;
            while (k11 < val.length) {
                switch (cmd) {
                    case 'A':
                        k10 = k11;
                        drawArc(path, currentX2, currentSegmentStartY3, val[k10 + 5], val[k10 + 6], val[k10 + 0], val[k10 + 1], val[k10 + 2], val[k10 + 3] != 0.0f, val[k10 + 4] != 0.0f);
                        float currentX3 = val[k10 + 5];
                        float currentY2 = val[k10 + 6];
                        currentX2 = currentX3;
                        currentSegmentStartY3 = currentY2;
                        ctrlPointX2 = currentX3;
                        ctrlPointY2 = currentY2;
                        break;
                    case 'C':
                        k10 = k11;
                        path.cubicTo(val[k10 + 0], val[k10 + 1], val[k10 + 2], val[k10 + 3], val[k10 + 4], val[k10 + 5]);
                        currentX2 = val[k10 + 4];
                        currentSegmentStartY3 = val[k10 + 5];
                        ctrlPointX2 = val[k10 + 2];
                        ctrlPointY2 = val[k10 + 3];
                        break;
                    case 'H':
                        k10 = k11;
                        path2.lineTo(val[k10 + 0], currentSegmentStartY3);
                        currentX2 = val[k10 + 0];
                        break;
                    case 'L':
                        k10 = k11;
                        path2.lineTo(val[k10 + 0], val[k10 + 1]);
                        currentX2 = val[k10 + 0];
                        currentSegmentStartY3 = val[k10 + 1];
                        break;
                    case 'M':
                        k10 = k11;
                        float currentX4 = val[k10 + 0];
                        float currentY3 = val[k10 + 1];
                        if (k10 > 0) {
                            path2.lineTo(val[k10 + 0], val[k10 + 1]);
                            currentX2 = currentX4;
                            currentSegmentStartY3 = currentY3;
                        } else {
                            path2.moveTo(val[k10 + 0], val[k10 + 1]);
                            currentX2 = currentX4;
                            currentSegmentStartY3 = currentY3;
                            currentSegmentStartX2 = currentX4;
                            currentSegmentStartY2 = currentY3;
                        }
                        break;
                    case 'Q':
                        k10 = k11;
                        path2.quadTo(val[k10 + 0], val[k10 + 1], val[k10 + 2], val[k10 + 3]);
                        ctrlPointX2 = val[k10 + 0];
                        ctrlPointY2 = val[k10 + 1];
                        currentX2 = val[k10 + 2];
                        currentSegmentStartY3 = val[k10 + 3];
                        break;
                    case 'S':
                        float currentY4 = currentSegmentStartY3;
                        k10 = k11;
                        char previousCmd3 = previousCmd2;
                        float currentX5 = currentX2;
                        if (previousCmd3 != 'c' && previousCmd3 != 's' && previousCmd3 != 'C' && previousCmd3 != 'S') {
                            reflectiveCtrlPointX = currentX5;
                            reflectiveCtrlPointY = currentY4;
                        } else {
                            float reflectiveCtrlPointX3 = (currentX5 * 2.0f) - ctrlPointX2;
                            float reflectiveCtrlPointY3 = (currentY4 * 2.0f) - ctrlPointY2;
                            reflectiveCtrlPointX = reflectiveCtrlPointX3;
                            reflectiveCtrlPointY = reflectiveCtrlPointY3;
                        }
                        path.cubicTo(reflectiveCtrlPointX, reflectiveCtrlPointY, val[k10 + 0], val[k10 + 1], val[k10 + 2], val[k10 + 3]);
                        ctrlPointX2 = val[k10 + 0];
                        ctrlPointY2 = val[k10 + 1];
                        currentX2 = val[k10 + 2];
                        currentSegmentStartY3 = val[k10 + 3];
                        break;
                    case 'T':
                        float currentY5 = currentSegmentStartY3;
                        k10 = k11;
                        char previousCmd4 = previousCmd2;
                        float currentX6 = currentX2;
                        float reflectiveCtrlPointX4 = currentX6;
                        float reflectiveCtrlPointY4 = currentY5;
                        if (previousCmd4 == 'q' || previousCmd4 == 't' || previousCmd4 == 'Q' || previousCmd4 == 'T') {
                            reflectiveCtrlPointX4 = (currentX6 * 2.0f) - ctrlPointX2;
                            reflectiveCtrlPointY4 = (currentY5 * 2.0f) - ctrlPointY2;
                        }
                        path2.quadTo(reflectiveCtrlPointX4, reflectiveCtrlPointY4, val[k10 + 0], val[k10 + 1]);
                        ctrlPointX2 = reflectiveCtrlPointX4;
                        ctrlPointY2 = reflectiveCtrlPointY4;
                        currentX2 = val[k10 + 0];
                        currentSegmentStartY3 = val[k10 + 1];
                        break;
                    case 'V':
                        float currentX7 = currentX2;
                        k10 = k11;
                        path2 = path;
                        path2.lineTo(currentX7, val[k10 + 0]);
                        currentSegmentStartY3 = val[k10 + 0];
                        currentX2 = currentX7;
                        break;
                    case 'a':
                        float currentY6 = currentSegmentStartY3;
                        k10 = k11;
                        drawArc(path, currentX2, currentY6, val[k11 + 5] + currentX2, val[k11 + 6] + currentY6, val[k11 + 0], val[k11 + 1], val[k11 + 2], val[k11 + 3] != 0.0f, val[k11 + 4] != 0.0f);
                        currentX2 += val[k10 + 5];
                        currentSegmentStartY3 = currentY6 + val[k10 + 6];
                        path2 = path;
                        ctrlPointX2 = currentX2;
                        ctrlPointY2 = currentSegmentStartY3;
                        break;
                    case 'c':
                        float currentY7 = currentSegmentStartY3;
                        path.rCubicTo(val[k11 + 0], val[k11 + 1], val[k11 + 2], val[k11 + 3], val[k11 + 4], val[k11 + 5]);
                        float ctrlPointX3 = val[k11 + 2] + currentX2;
                        float ctrlPointY3 = currentY7 + val[k11 + 3];
                        currentX2 += val[k11 + 4];
                        ctrlPointX2 = ctrlPointX3;
                        ctrlPointY2 = ctrlPointY3;
                        k10 = k11;
                        currentSegmentStartY3 = val[k11 + 5] + currentY7;
                        break;
                    case 'h':
                        path2.rLineTo(val[k11 + 0], 0.0f);
                        currentX2 += val[k11 + 0];
                        k10 = k11;
                        break;
                    case 'l':
                        path2.rLineTo(val[k11 + 0], val[k11 + 1]);
                        currentX2 += val[k11 + 0];
                        currentSegmentStartY3 += val[k11 + 1];
                        k10 = k11;
                        break;
                    case 'm':
                        currentX2 += val[k11 + 0];
                        currentSegmentStartY3 += val[k11 + 1];
                        if (k11 > 0) {
                            path2.rLineTo(val[k11 + 0], val[k11 + 1]);
                            k10 = k11;
                        } else {
                            path2.rMoveTo(val[k11 + 0], val[k11 + 1]);
                            currentSegmentStartX2 = currentX2;
                            currentSegmentStartY2 = currentSegmentStartY3;
                            k10 = k11;
                        }
                        break;
                    case 'q':
                        float currentY8 = currentSegmentStartY3;
                        path2.rQuadTo(val[k11 + 0], val[k11 + 1], val[k11 + 2], val[k11 + 3]);
                        float ctrlPointX4 = val[k11 + 0] + currentX2;
                        float ctrlPointY4 = currentY8 + val[k11 + 1];
                        currentX2 += val[k11 + 2];
                        ctrlPointX2 = ctrlPointX4;
                        ctrlPointY2 = ctrlPointY4;
                        k10 = k11;
                        currentSegmentStartY3 = val[k11 + 3] + currentY8;
                        break;
                    case 's':
                        if (previousCmd2 != 'c' && previousCmd2 != 's' && previousCmd2 != 'C' && previousCmd2 != 'S') {
                            reflectiveCtrlPointX2 = 0.0f;
                            reflectiveCtrlPointY2 = 0.0f;
                        } else {
                            float reflectiveCtrlPointX5 = currentX2 - ctrlPointX2;
                            float reflectiveCtrlPointY5 = currentSegmentStartY3 - ctrlPointY2;
                            reflectiveCtrlPointX2 = reflectiveCtrlPointX5;
                            reflectiveCtrlPointY2 = reflectiveCtrlPointY5;
                        }
                        float currentY9 = currentSegmentStartY3;
                        path.rCubicTo(reflectiveCtrlPointX2, reflectiveCtrlPointY2, val[k11 + 0], val[k11 + 1], val[k11 + 2], val[k11 + 3]);
                        float ctrlPointX5 = val[k11 + 0] + currentX2;
                        float ctrlPointY5 = currentY9 + val[k11 + 1];
                        currentX2 += val[k11 + 2];
                        ctrlPointX2 = ctrlPointX5;
                        ctrlPointY2 = ctrlPointY5;
                        k10 = k11;
                        currentSegmentStartY3 = val[k11 + 3] + currentY9;
                        break;
                    case 't':
                        float reflectiveCtrlPointX6 = 0.0f;
                        float reflectiveCtrlPointY6 = 0.0f;
                        if (previousCmd2 == 'q' || previousCmd2 == 't' || previousCmd2 == 'Q' || previousCmd2 == 'T') {
                            reflectiveCtrlPointX6 = currentX2 - ctrlPointX2;
                            reflectiveCtrlPointY6 = currentSegmentStartY3 - ctrlPointY2;
                        }
                        path2.rQuadTo(reflectiveCtrlPointX6, reflectiveCtrlPointY6, val[k11 + 0], val[k11 + 1]);
                        float ctrlPointX6 = currentX2 + reflectiveCtrlPointX6;
                        float ctrlPointY6 = currentSegmentStartY3 + reflectiveCtrlPointY6;
                        currentX2 += val[k11 + 0];
                        currentSegmentStartY3 += val[k11 + 1];
                        ctrlPointX2 = ctrlPointX6;
                        ctrlPointY2 = ctrlPointY6;
                        k10 = k11;
                        break;
                    case 'v':
                        path2.rLineTo(0.0f, val[k11 + 0]);
                        currentSegmentStartY3 += val[k11 + 0];
                        k10 = k11;
                        break;
                    default:
                        k10 = k11;
                        break;
                }
                previousCmd2 = cmd;
                k11 = k10 + incr;
            }
            current[0] = currentX2;
            current[1] = currentSegmentStartY3;
            current[2] = ctrlPointX2;
            current[3] = ctrlPointY2;
            current[4] = currentSegmentStartX2;
            current[5] = currentSegmentStartY2;
        }

        private static void drawArc(Path p8, float x10, float y10, float x11, float y11, float a10, float b, float theta, boolean isMoreThanHalf, boolean isPositiveArc) {
            double cx;
            double cy;
            double thetaD = Math.toRadians(theta);
            double cosTheta = Math.cos(thetaD);
            double sinTheta = Math.sin(thetaD);
            double x0p = ((((double) x10) * cosTheta) + (((double) y10) * sinTheta)) / ((double) a10);
            double y0p = ((((double) (-x10)) * sinTheta) + (((double) y10) * cosTheta)) / ((double) b);
            double x1p = ((((double) x11) * cosTheta) + (((double) y11) * sinTheta)) / ((double) a10);
            double y1p = ((((double) (-x11)) * sinTheta) + (((double) y11) * cosTheta)) / ((double) b);
            double dx = x0p - x1p;
            double dy = y0p - y1p;
            double xm2 = (x0p + x1p) / 2.0d;
            double ym2 = (y0p + y1p) / 2.0d;
            double dsq = (dx * dx) + (dy * dy);
            if (dsq == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double disc = (1.0d / dsq) - 0.25d;
            if (disc < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + dsq);
                float adjust = (float) (Math.sqrt(dsq) / 1.99999d);
                drawArc(p8, x10, y10, x11, y11, a10 * adjust, b * adjust, theta, isMoreThanHalf, isPositiveArc);
                return;
            }
            double s8 = Math.sqrt(disc);
            double sdx = s8 * dx;
            double sdy = s8 * dy;
            if (isMoreThanHalf == isPositiveArc) {
                cx = xm2 - sdy;
                cy = ym2 + sdx;
            } else {
                cx = xm2 + sdy;
                cy = ym2 - sdx;
            }
            double eta0 = Math.atan2(y0p - cy, x0p - cx);
            double eta1 = Math.atan2(y1p - cy, x1p - cx);
            double sweep = eta1 - eta0;
            if (isPositiveArc != (sweep >= 0.0d)) {
                if (sweep > 0.0d) {
                    sweep -= 6.283185307179586d;
                } else {
                    sweep += 6.283185307179586d;
                }
            }
            double eta2 = a10;
            double cx2 = cx * eta2;
            double cy2 = ((double) b) * cy;
            double cx3 = (cx2 * cosTheta) - (cy2 * sinTheta);
            double cy3 = (cx2 * sinTheta) + (cy2 * cosTheta);
            double cy4 = a10;
            arcToBezier(p8, cx3, cy3, cy4, b, x10, y10, thetaD, eta0, sweep);
        }

        private static void arcToBezier(Path p8, double cx, double cy, double a10, double b, double e1x, double e1y, double theta, double start, double sweep) {
            double d10 = a10;
            int numSegments = (int) Math.ceil(Math.abs((sweep * 4.0d) / 3.141592653589793d));
            double cosTheta = Math.cos(theta);
            double sinTheta = Math.sin(theta);
            double cosEta1 = Math.cos(start);
            double sinEta1 = Math.sin(start);
            double ep1x = (((-d10) * cosTheta) * sinEta1) - ((b * sinTheta) * cosEta1);
            double ep1x2 = -d10;
            double ep1y = (ep1x2 * sinTheta * sinEta1) + (b * cosTheta * cosEta1);
            double ep1y2 = ep1y;
            double ep1y3 = numSegments;
            double anglePerSegment = sweep / ep1y3;
            double eta1 = start;
            int i10 = 0;
            double eta2 = e1x;
            double ep1x3 = ep1x;
            double e1y2 = e1y;
            while (i10 < numSegments) {
                double eta3 = eta1 + anglePerSegment;
                double sinEta2 = Math.sin(eta3);
                double cosEta2 = Math.cos(eta3);
                double anglePerSegment2 = anglePerSegment;
                double anglePerSegment3 = (cx + ((d10 * cosTheta) * cosEta2)) - ((b * sinTheta) * sinEta2);
                double cosEta3 = cosEta1;
                double cosEta4 = cy + (d10 * sinTheta * cosEta2) + (b * cosTheta * sinEta2);
                double sinEta3 = sinEta1;
                double ep2x = (((-d10) * cosTheta) * sinEta2) - ((b * sinTheta) * cosEta2);
                double e2y = -d10;
                double ep2y = (e2y * sinTheta * sinEta2) + (b * cosTheta * cosEta2);
                double tanDiff2 = Math.tan((eta3 - eta1) / 2.0d);
                double alpha = (Math.sin(eta3 - eta1) * (Math.sqrt(((tanDiff2 * 3.0d) * tanDiff2) + 4.0d) - 1.0d)) / 3.0d;
                double q1x = eta2 + (alpha * ep1x3);
                int numSegments2 = numSegments;
                double q1y = e1y2 + (alpha * ep1y2);
                double q2x = anglePerSegment3 - (alpha * ep2x);
                double q2y = cosEta4 - (alpha * ep2y);
                p8.rLineTo(0.0f, 0.0f);
                p8.cubicTo((float) q1x, (float) q1y, (float) q2x, (float) q2y, (float) anglePerSegment3, (float) cosEta4);
                eta1 = eta3;
                eta2 = anglePerSegment3;
                e1y2 = cosEta4;
                ep1x3 = ep2x;
                ep1y2 = ep2y;
                i10++;
                numSegments = numSegments2;
                sinEta1 = sinEta3;
                anglePerSegment = anglePerSegment2;
                cosEta1 = cosEta3;
                cosTheta = cosTheta;
                sinTheta = sinTheta;
                d10 = a10;
            }
        }
    }

    private PathParser() {
    }
}
