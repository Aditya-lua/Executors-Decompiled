/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3477c..0xb34924 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_b3477c(unsigned long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9, long long a10, long long a11, long long a12, char **a13, char **a14, unsigned long long *a15)
{
    unsigned int v5;  // w25
    char *v6;  // x0
    char *v7;  // x24
    long long v0;  // [bp-0xd8]
    char v1;  // [bp-0xb0]
    char *v2;  // [bp-0x78]
    char *v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]

    v4 = &a8;
    v2 = 0;
    v3 = 0;
    if (a0 > 0xffffff)
        return 0;
    v5 = (unsigned int)a0 * 8;
    *(unsigned int *)&v0 = v5;
    if (sub_b34b5c(&v1, 0, 0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, v0, 0, a9, a7, a6) && sub_c68eb8(&v1, &v2))
    {
        sub_a6ed4c(&v1);
        v6 = sub_a6bffc(v2, "providers/implementations/kdfs/x942kdf.c", 231);
        if (v6)
        {
            *(unsigned int *)&v0 = v5;
            v7 = v6;
            if (sub_b34b5c(&v1, v7, v2, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, v0, &v3))
            {
                if (sub_a6e990(&v1) != v7)
                {
                    sub_a6ed4c(&v1);
                    return 0;
                }
                else if (!v3)
                {
                    sub_a6ed4c(&v1);
                    return 0;
                }
                else if (*v3 == 4 && v3[1] == 4)
                {
                    *a15 = v3 + 2;
                    *a13 = v7;
                    *a14 = v2;
                    sub_a6ed4c(&v1);
                    return 1;
                }
            }
        }
    }
    sub_a6ed4c(&v1);
    return 0;
}
