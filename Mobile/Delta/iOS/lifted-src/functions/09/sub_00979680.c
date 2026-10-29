/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979680..0x9796d4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979680_0 {
    char padding_0[1568];
    unsigned long long field_620;
} st_979680_0;


void sub_979680(st_979680_0 *a0)
{
    unsigned long long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = 0;
    v3 = 0;
    if (!(a0->field_620 >> 37 & 1))
    {
        a0->field_620 = a0->field_620 | 0x2000000000;
        v0 = 1;
        v2 = "network BIO I/O error";
        v3 = 21;
        sub_978d84();
    }
    return;
}
