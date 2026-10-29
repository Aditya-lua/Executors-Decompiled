/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9cf18..0xa9cff8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9cf18_0 {
    char field_0;
} st_a9cf18_0;


unsigned long long sub_a9cf18(st_a9cf18_0 **a0, char *a1, unsigned int a2)
{
    char *v2;  // x21
    unsigned long long v3;  // w22
    unsigned long long v4;  // x23
    unsigned int v5;  // w8
    unsigned long long v6;  // x0
    unsigned long long v7;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if ((int)a2 >= 1)
    {
        _bzero(a1, a2);
        v3 = 0;
        v4 = 0;
        v5 = a2 * 2;
        if (1 >= (int)v5)
            v5 = 1;
        do
        {
            v6 = sub_a6dd0c(*v2);
            if (v6 >> 31 & 1)
            {
                sub_a368c8();
                sub_a369bc("crypto/pem/pem_lib.c", 604, "load_iv");
                sub_a36abc(9, 103, 0);
                return 0;
            }
        } while ((v2 += 1, v7 = (v4 * 0x8000000000000000 | v4 >> 1) & 0x800000007fffffff & 0x7fffffff, a1[v7] = a1[v7] | (char)((unsigned int)v6 << (4 & (char)~v3 & 31)), v4 += 1, v3 += 4, v5 != (unsigned int)v4));
    }
    *a0 = v2;
    return 1;
}
