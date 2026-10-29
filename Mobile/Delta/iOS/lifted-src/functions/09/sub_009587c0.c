/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9587c0..0x9588a8 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9587c0_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[2152];
    struct st_9587c0_1 *field_880;
} st_9587c0_0;

typedef struct st_9587c0_1 {
    struct st_9587c0_0 *field_0;
} st_9587c0_1;


st_9587c0_0 * sub_9587c0(st_9587c0_0 *a0, st_9587c0_1 **a1, long long a2)
{
    st_9587c0_1 **v2;  // x8
    st_9587c0_0 *v3;  // x23
    st_9587c0_0 *v4;  // x22
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_880;
    if (!a0)
        v2 = a1 + 43;
    v3 = *(long long *)*v2;
    if (!v3)
        return 0;
    if ((int)sub_ad69e4(a2) >= 1)
    {
        v4 = 0;
        do
        {
            v5 = sub_96ca2c(a0, a1, sub_ad69f8(a2, v4), 0);
            if ((unsigned int)v5 != 1)
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_cert.c", 311, "ssl_cert_set0_chain");
                sub_a36abc(20, v5, 0);
                return 0;
            }
        } while ((v4 = (unsigned int)v4 + 1, (int)(unsigned int)v4 < (int)sub_ad69e4(a2)));
    }
    sub_aded90(v3->field_10);
    v3->field_10 = a2;
    return 1;
}
