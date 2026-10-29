/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d397c..0x3d3a38 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d397c_0 {
    char field_0;
    char field_1;
    char field_2;
    unsigned int field_3;
} st_3d397c_0;


st_3d397c_0 * sub_3d397c(st_3d397c_0 *a0, char *a1, char *a2, char *a3, unsigned long long a4, int a5)
{
    char *iter;  // x9
    unsigned long long i;  // x16
    unsigned int v10;  // w0
    unsigned int v11;  // w17
    unsigned long long v2;  // x16
    char *v3;  // x1
    unsigned int v4;  // w17
    char *v5;  // x3
    unsigned int v6;  // w0
    char *v7;  // x2
    unsigned int v8;  // w4
    unsigned int v9;  // w4

    if (a4 < 1)
        return a0;
    iter = &a0->field_1;
    i = a4;
    do
    {
        v2 = i;
        v3 = a1 + 1;
        v4 = 0x80000 | *a1 * 0x100000;
        v5 = a3 + 1;
        v6 = *a3 + 128;
        v7 = a2 + 1;
        v8 = *a2 + 128;
        v9 = (int)(v4 + 0x166f00 * v6) >> 20 & ~((int)(v4 + 0x166f00 * v6) >> 31);
        v10 = (int)(v4 + 0xfff49300 * v6 + (0xfffa7e00 * v8 & 0xffff0000)) >> 20 & ~((int)(v4 + 0xfff49300 * v6 + (0xfffa7e00 * v8 & 0xffff0000)) >> 31);
        v11 = (int)(v4 + 0x1c5a00 * v8) >> 20 & ~((int)(v4 + 0x1c5a00 * v8) >> 31);
        *(iter - 1) = ((int)v9 < 0xff ? v9 : 0xff);
        *iter = ((int)v10 < 0xff ? v10 : 0xff);
        iter[1] = ((int)v11 < 0xff ? v11 : 0xff);
        iter[2] = 0xff;
        iter = &iter[a5];
        i = v2 - 1;
        a1 = v3;
        a3 = v5;
        a2 = v7;
    } while (i);
    return ((int)v10 < 0xff ? v10 : 0xff);
}
