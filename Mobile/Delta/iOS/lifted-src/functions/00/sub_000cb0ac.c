/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcb0ac..0xcb1fc (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cb0ac_0 {
    char field_0;
} st_cb0ac_0;


unsigned long long sub_cb0ac(unsigned long long a0, unsigned long a1, long long a2, unsigned long long *a3, unsigned long long *a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v4;  // x2
    unsigned long long v5;  // x20
    unsigned long long v6;  // x1
    unsigned long long v7;  // x24
    unsigned long long v8;  // x9
    long long iter;  // x19
    unsigned long long v10;  // x23
    st_cb0ac_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_cb0ac_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    unsigned long v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a3;
    v5 = a3[1] + v4;
    if (v5 > a1 - a0)
        return 0xffffffffffffffba;
    v6 = *a4;
    if (v4 > a5 - v6)
        return 0xffffffffffffffec;
    v7 = v6 + v4;
    v8 = a3[2];
    if (a0 <= v6 || a0 >= v7)
    {
        iter = a0 + v4;
        sub_c62a8();
        *a4 = v7;
        if (a3[2] > iter - a6)
        {
            if (iter - a7 < a3[2])
                return 0xffffffffffffffec;
            v10 = iter - v8 - a6;
            if (v3 + v10 + a3[1] > v3)
            {
                _memmove(iter);
                iter -= v10;
                a3[1] = a3[1] + v10;
LABEL_cb1bc:
                sub_cad5c(iter, a2);
            }
            else
            {
                _memmove(iter);
            }
            return v5;
        }
        goto LABEL_cb1bc;
    }
    return 0xffffffffffffffba;
}
