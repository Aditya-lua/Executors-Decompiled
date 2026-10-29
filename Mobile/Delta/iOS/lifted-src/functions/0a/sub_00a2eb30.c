/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2eb30..0xa2ec1c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a2eb30(void* a0, void* a1)
{
    void* v2;  // x0
    long long v3;  // x0
    void* v4;  // x0
    void* v5;  // x0
    void* v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a1[16])
    {
        v2 = a0;
        if (!(char)a1[37])
        {
            v3 = sub_a68f38(*(long long *)a1);
            v2 = sub_a68e7c(v3, (long long)a1[16]);
            *(unsigned int *)&a1[24] = (unsigned int)v2;
            if ((unsigned int)v2 && (!_strcmp((long long)a1[16], "id-ecPublicKey") || (v2 = _strcmp((long long)a1[16], "1.2.840.10045.2.1"), !(unsigned int)v2)))
            {
                v2 = sub_a68e7c(v3, "SM2");
                *(unsigned int *)&a1[28] = (unsigned int)v2;
            }
            *(char *)&a1[37] = 1;
        }
        if (!(int)a1[24])
        {
            return v2;
        }
        else if ((int)a0[4] != (int)a1[24] && (int)a0[4] != (int)a1[28])
        {
            return v2;
        }
    }
    v4 = sub_a2d050(a0);
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_ad68a0((long long)a1[48], a0);
    if (0 < (int)(unsigned int)v5)
        return v5;
    v6 = sub_a55830(a0);
    *(char *)&a1[36] = 1;
    return v6;
}
