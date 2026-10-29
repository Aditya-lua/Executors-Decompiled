/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71220..0xa712cc (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71220_0 {
    char padding_0[16];
    long long field_10;
    unsigned long long field_18;
} st_a71220_0;


int sub_a71220(st_a71220_0 *a0, unsigned long long *a1, unsigned long long a2)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a712cc();
    if (!v2)
        return v2;
    v3 = a0->field_18;
    if (a0->field_18 >= a2)
        v3 = sub_a6da94(a0->field_10);
    if (a2 <= v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1402, "OSSL_PARAM_get_utf8_string");
        sub_a36abc(15, 128, 0);
        return 0;
    }
    *(char *)(*a1 + v3) = 0;
    return 1;
}
