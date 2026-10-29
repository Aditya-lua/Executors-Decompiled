/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae70fc..0xae7138 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae70fc_0 {
    char padding_0[16];
    long long field_10;
} st_ae70fc_0;


int sub_ae70fc(unsigned int a0, st_ae70fc_0 **a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    switch (a0)
    {
    case 3:
        v0 = &v2;
        v1 = v3;
        sub_afa390(*a1->field_10);
        return 1;
    case 1:
        *a1->field_10 = 0;
        return 1;
    default:
        return 1;
    }
}
