/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d4a8..0x1d5a0 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_1d4a8(void* a0, unsigned long long a1)
{
    unsigned long long v0;  // x10
    unsigned long long v1;  // x8
    unsigned long long v2;  // x8
    unsigned long v3;  // x9
    unsigned long long v4;  // x8
    unsigned long v5;  // x8
    unsigned long long v6;  // x0
    unsigned long v7;  // x8
    unsigned long long v8;  // x9

    if (a1 >= 9)
    {
        v0 = *(long long *)((char *)a0 + a1 - 8) + a1;
        if (a1 & 63)
            v0 = v0 << (char)(64 - (a1 & 63)) | v0 >> ((char)a1 & 63);
        v1 = 0x9ddfea08eb382d69 * (v0 ^ *(long long *)a0);
        v2 = 0x9ddfea08eb382d69 * (v0 ^ v1 >> 47 ^ v1);
        return 0x9ddfea08eb382d69 * (v2 ^ v2 >> 47) ^ *(long long *)((char *)a0 + a1 - 8);
    }
    else if (a1 >= 4)
    {
        v3 = *(int *)((char *)a0 + a1 - 4);
        v4 = 0x9ddfea08eb382d69 * (*(int *)a0 * 8 + a1 ^ v3);
        v5 = v3 ^ v4 >> 47 ^ v4;
        return 0x9ddfea08eb382d69 * (0x9ddfea08eb382d69 * v5 ^ 0x9ddfea08eb382d69 * v5 >> 47);
    }
    else
    {
        v6 = 11160318154034397263;
        if (a1)
        {
            v7 = *((char *)a0 + a1 - 1);
            v8 = 11160318154034397263 * (*(char *)a0 | *((char *)a0 + (a1 >> 1)) * 0x100);
            v6 = 11160318154034397263 * (14504361325974414679 * (a1 | v7 * 4) ^ v8 ^ (14504361325974414679 * (a1 | v7 * 4) ^ v8) >> 47);
        }
        return v6;
    }
}
