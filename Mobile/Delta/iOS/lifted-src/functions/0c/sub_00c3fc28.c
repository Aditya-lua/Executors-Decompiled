/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3fc28..0xc3fd90 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c3fc28(unsigned long long a0, void* iter)
{
    unsigned long long v0;  // x9
    unsigned int v1;  // w10
    unsigned int v10;  // w16
    unsigned long long idx;  // x17
    unsigned short v12;  // x16
    unsigned int v13;  // w10
    unsigned long long v2;  // x11
    unsigned int v3;  // w10
    unsigned int v4;  // w11
    unsigned int v5;  // w12
    unsigned int v6;  // w13
    unsigned short v7;  // x10
    unsigned int v8;  // w9
    unsigned int i;  // w15

    if (a0 > 0xffffffff)
    {
        v0 = a0 / 100000000;
        v1 = (unsigned int)a0 + 0xfa0a1f00 * (unsigned int)v0;
        v2 = v1 / 10000;
        v3 = v1 - 10000 * (unsigned int)v2;
        v4 = (unsigned int)v2 - 10000 * (unsigned int)(429497 * v2 >> 32);
        v5 = 5243 * (__ROL__(v3, 30) & 0xc0003fff & 0x3fff) >> 0x11;
        v6 = 5243 * (__ROL__(v4, 30) & 0xc0003fff & 0x3fff) >> 0x11;
        v7 = *(short *)(2 * (v3 - 100 * v5 & 0xffff) + 14721940);
        *(short *)((char *)iter - 8) = *(short *)(2 * v6 + 14721940);
        iter -= 8;
        *(unsigned short *)&iter[6] = v7;
        *(short *)&iter[4] = *(short *)(2 * v5 + 14721940);
        *(short *)&iter[2] = *(short *)(2 * (v4 - 100 * v6 & 0xffff) + 14721940);
        a0 = v0;
    }
    v8 = a0;
    if ((unsigned int)a0 >> 4 >= 625)
    {
        do
        {
            i = v8;
            v8 /= 10000;
            v10 = i + 0xffffd8f0 * v8;
            idx = v10 / 100;
            v12 = *(short *)(2 * v10 + -200 * idx + 14721940);
            *(short *)((char *)iter - 4) = *(short *)(2 * idx + 14721940);
            iter -= 4;
            *(unsigned short *)&iter[2] = v12;
        } while (0x5f5e0ff < i);
    }
    if (v8 > 99)
    {
        v13 = 5243 * (__ROL__(v8, 30) & 0xc0003fff & 0x3fff) >> 0x11;
        *(short *)((char *)iter - 2) = *(short *)(2 * (v8 - 100 * v13 & 0xffff) + 14721940);
        iter -= 2;
        v8 = v13;
    }
    if (v8 <= 9)
    {
        *((char *)iter - 1) = (char)v8 | 48;
        return;
    }
    *(short *)((char *)iter - 2) = *(short *)(2 * v8 + 14721940);
    return;
}
