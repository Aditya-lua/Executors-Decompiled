/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd72f8..0xbd7360 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bd72f8(void* a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v10;  // x8
    unsigned long long v11;  // x8
    unsigned long long v2;  // x10
    unsigned long long v3;  // 4128
    unsigned long long v4;  // 4130
    unsigned long long v5;  // x9
    unsigned long long v6;  // x9
    unsigned long long v7;  // x8
    unsigned long long v8;  // 4135
    unsigned long long v9;  // 4137

    v0 = a2 & a1;
    v1 = *(long long *)((char *)a0 + v0) & 0x8080808080808080;
    if (!(*(long long *)((char *)a0 + v0) & 0x8080808080808080))
    {
        v2 = 8;
        do
        {
            v0 = v0 + v2 & a1;
            v2 += 8;
            v1 = *(long long *)((char *)a0 + v0) & 0x8080808080808080;
        } while (!(*(long long *)((char *)a0 + v0) & 0x8080808080808080));
    }
    v3 = ((((((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v4 = (((((((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v1 & 0xaaaaaaaaaaaaaaaa) >> 1 | v1 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v5 = ((((v4 | v3) & 0xffff0000ffff0000) >> 16 | (v4 | v3) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v4 | v3) & 0xffff0000ffff0000) >> 16 | (v4 | v3) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v5)
        v6 = 64;
    else
        v6 = Clz(v5);
    if (*((char *)a0 + (v0 + (v6 >> 3) & a1)) < 0)
        return v0 + (v6 >> 3) & a1;
    v7 = *(long long *)a0 & 0x8080808080808080;
    v8 = ((((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
    v9 = (((((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v7 & 0xaaaaaaaaaaaaaaaa) >> 1 | v7 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
    v10 = ((((v9 | v8) & 0xffff0000ffff0000) >> 16 | (v9 | v8) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v9 | v8) & 0xffff0000ffff0000) >> 16 | (v9 | v8) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
    if (!v10)
        v11 = 64;
    else
        v11 = Clz(v10);
    return v11 >> 3;
}
