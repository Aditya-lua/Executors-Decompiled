/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x973d5c..0x973e9c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_973d5c_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
    char field_20;
} st_973d5c_0;

extern char g_10002b0;

unsigned long long sub_973d5c(long long a0, st_973d5c_0 *a1)
{
    unsigned long long v5;  // x0
    unsigned long v6;  // x2
    unsigned long v0;  // [bp-0x50]
    char v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = sub_c61590();
    if ((unsigned int)v5)
    {
        sub_973a98();
        v6 = a1->field_0;
        if (a1->field_20 & 1)
            goto LABEL_973e04;
        if (15 >= v6 - 1)
        {
            goto LABEL_973e38;
        }
        else if ((v6 >> 8 & 0xffffffffffffff) == 1)
        {
            v0 = v6;
            sub_9d5b44(&v1, 32, "crypto_error_0x%03llx");
LABEL_973e38:
            sub_973a98(a0, "connection_code");
        }
        else
        {
LABEL_973e04:
            sub_973b10(a0);
        }
        sub_973acc(a0, "reason", a1->field_10, a1->field_18);
        v5 = sub_c6186c(a0);
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
