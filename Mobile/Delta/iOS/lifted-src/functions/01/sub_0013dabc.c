/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13dabc..0x13db60 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13dabc_0 {
    long long field_0;
    struct st_13dabc_1 *field_8;
} st_13dabc_0;

typedef struct st_13dabc_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_13dabc_1;

extern char g_e6ecf8;

int sub_13dabc(long long a0)
{
    long long v2;  // x19
    st_13dabc_0 *v3;  // x8
    st_13dabc_1 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = operatornew(208);
    sub_13c898(v2, a0);
    v3->field_0 = v2;
    v4 = operatornew(32);
    v4->field_0 = &g_e6ecf8;
    v4->field_8 = 0;
    v4->field_10 = 0;
    v4->field_18 = v2;
    v3->field_8 = v4;
    return (unsigned int)v4;
}
