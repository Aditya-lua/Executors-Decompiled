/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3d390..0xa3d42c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3d390_1 {
    char padding_0[32];
    long long field_20;
    char padding_28[8];
    struct st_a3d390_0 *field_30;
} st_a3d390_1;

typedef struct st_a3d390_0 {
    char padding_0[8];
    unsigned int field_8;
} st_a3d390_0;


unsigned long long sub_a3d390(unsigned long a0, unsigned long a1, st_a3d390_1 *a2)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a5b018(a2->field_20);
    switch (v2)
    {
    case 116:
        v3 = sub_9ffdd0(sub_a5ace4(a2->field_20));
        if (!v3)
            return 0;
        break;
    case 28:
        v3 = sub_9ffdd0(sub_a5af48(a2->field_20));
        if (!v3)
            return 0;
        break;
    default:
        return 0;
    }
    if (a2->field_30->field_8 != 2)
        return 0;
    a2->field_20 = v3;
}
