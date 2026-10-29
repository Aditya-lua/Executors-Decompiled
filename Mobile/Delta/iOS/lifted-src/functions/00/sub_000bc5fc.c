/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc5fc..0xbc6e0 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_bc5fc(unsigned int *a0, unsigned long long a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v10;  // w11
    unsigned int v11;  // w10
    unsigned int v12;  // w10
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w8
    unsigned int v5;  // w11
    unsigned int v6;  // w9
    unsigned int v7;  // w12
    unsigned int v8;  // w8
    unsigned int v9;  // w9

    if (a0[24] != 2)
    {
        v0 = a0[12] + 1;
        if (!(v0 * 0x100000000))
            v1 = 32;
        else
            v1 = Clz(v0 * 0x100000000);
        if (!a1)
            v2 = 0x1f00 - v1 * 0x100;
        else
            v2 = (v0 * 0x100 >> ((char)~v1 & 31)) + (31 - v1) * 0x100;
        a0[16] = v2;
    }
    v3 = a0[13] + 1;
    if (!(v3 * 0x100000000))
        v4 = 32;
    else
        v4 = Clz(v3 * 0x100000000);
    if (a1)
    {
        v5 = a0[15];
        v6 = a0[14] + 1;
        if (!(v6 * 0x100000000))
            v7 = 32;
        else
            v7 = Clz(v6 * 0x100000000);
        a0[0x11] = (v3 * 0x100 >> ((char)~v4 & 31)) + (unsigned int)(31 - v4) * 0x100;
        a0[18] = (v6 * 0x100 >> ((char)~v7 & 31)) + (unsigned int)(31 - v7) * 0x100;
        v8 = v5 + 1;
        if (!(v8 * 0x100000000))
            v9 = 32;
        else
            v9 = Clz(v8 * 0x100000000);
        a0[19] = (v8 * 0x100 >> ((char)~v9 & 31)) + (unsigned int)(31 - v9) * 0x100;
        return a0;
    }
    else
    {
        v10 = a0[15];
        v11 = a0[14] + 1;
        if (!(v11 * 0x100000000))
            v12 = 32;
        else
            v12 = Clz(v11 * 0x100000000);
        a0[0x11] = 0x1f00 - v4 * 0x100;
        a0[18] = 0x1f00 - v12 * 0x100;
        v13 = v10 + 1;
        if (!(v13 * 0x100000000))
            v14 = 32;
        else
            v14 = Clz(v13 * 0x100000000);
        a0[19] = 0x1f00 - v14 * 0x100;
        return a0;
    }
}
