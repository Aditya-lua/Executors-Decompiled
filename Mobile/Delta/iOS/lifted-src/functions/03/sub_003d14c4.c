/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d14c4..0x3d1570 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3d14c4(unsigned int *a0, unsigned int *a1)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // 4138
    unsigned long long v2;  // 4140
    unsigned int i;  // w9
    unsigned long long v4;  // x11
    unsigned long long v5;  // x10
    unsigned long long v6;  // x10
    unsigned long long v7;  // x10
    unsigned long long v8;  // x10
    unsigned long long v9;  // x9

    v0 = a0[6];
    v1 = ((((v0 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v0 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v0 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v0 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16;
    v2 = ((((v0 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v0 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v0 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v0 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0;
    i = ((((((v2 >> 4 | v1 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (v2 >> 4 | v1 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((v2 >> 4 | v1 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (v2 >> 4 | v1 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
    if ((int)a1[274] > (int)i)
    {
        v4 = 10;
        v5 = 10;
    }
    else
    {
        v6 = 275;
        do
        {
            v7 = v6;
            v8 = v7 + 1;
            v6 = v8;
        } while ((int)a1[v7] <= (int)i);
        if (14 < v8 - 266)
            return 0xffffffff;
        v4 = v8 - 265;
        v5 = v4;
    }
    v9 = *(short *)((char *)a1 + 2 * v4 + 1124) - *(short *)((char *)a1 + 2 * v4 + 0x400) + (i >> ((char)(16 - (unsigned int)v5) & 31));
    if (287 < (int)v9)
    {
        return 0xffffffff;
    }
    else if ((unsigned int)v5 == *((char *)a1 + v9 + 1156))
    {
        a0[6] = (unsigned int)v0 >> ((char)v5 & 31);
        a0[4] = a0[4] - v5;
        return *(short *)((char *)a1 + 2 * v9 + 1444);
    }
    else
    {
        return 0xffffffff;
    }
}
