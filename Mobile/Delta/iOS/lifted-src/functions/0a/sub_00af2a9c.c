/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2a9c..0xaf2b00 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2a9c_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_af2a9c_0;


void sub_af2a9c(st_af2a9c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0)
    {
        if (a0->field_0 != 2)
        {
            if (a0->field_0 != 1)
                goto LABEL_af2ae8;
            sub_afc404(a0->field_8);
        }
        else
        {
            sub_af99a8(a0->field_8);
        }
    }
LABEL_af2ae8:
}
