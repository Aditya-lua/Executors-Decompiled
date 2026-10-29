/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971220..0x9712d4 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971220_0 {
    char padding_0[8];
    struct st_971220_1 *field_8;
    char padding_10[3048];
    long long field_bf8;
    long long field_c00;
    char padding_c08[16];
    long long field_c18;
    long long field_c20;
} st_971220_0;

typedef struct st_971220_1 {
    long long field_0;
} st_971220_1;

extern char g_10002b0;

long long sub_971220(st_971220_0 *a0)
{
    long long v4;  // x0
    long long v5;  // x0
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if ((int)sub_aa845c(*(long long *)a0->field_8, &v0, 48, 0) >= 1)
    {
        a0->field_c20 = sub_9e4db0(&v0, 48, a0->field_c20);
        sub_a66ec0(&v0, 48);
        v4 = sub_ad5a5c(a0->field_c20, a0->field_bf8, a0->field_c00);
        a0->field_c18 = v4;
        v5 = v4 != 0;
    }
    else
    {
        v5 = 0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
