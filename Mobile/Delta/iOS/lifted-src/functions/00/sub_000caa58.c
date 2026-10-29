/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcaa58..0xcaba4 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_caa58_0 {
    char field_0;
} st_caa58_0;


unsigned long long sub_caa58(unsigned long a0, long long a1, unsigned long long *a2, unsigned long long *a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x21
    long long iter;  // x19
    unsigned long long v7;  // x23
    unsigned long long v8;  // x23
    st_caa58_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_caa58_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a2;
    v5 = a2[1] + v4;
    if (v5 > a1 - a0)
        return 0xffffffffffffffba;
    if (v4 > a4 - *a3)
        return 0xffffffffffffffec;
    iter = a0 + v4;
    v7 = iter - a2[2];
    sub_cad5c();
    *a3 = *a3 + v4;
    if (a2[2] > iter - a5)
    {
        if (iter - a6 < a2[2])
            return 0xffffffffffffffec;
        v8 = v7 - a5;
        if (a7 + v8 + a2[1] > a7)
        {
            _memmove(iter);
            iter -= v8;
            a2[1] = a2[1] + v8;
LABEL_cab64:
            sub_cad5c(iter, a1 - 32);
        }
        else
        {
            _memmove(iter);
        }
        return v5;
    }
    goto LABEL_cab64;
}
