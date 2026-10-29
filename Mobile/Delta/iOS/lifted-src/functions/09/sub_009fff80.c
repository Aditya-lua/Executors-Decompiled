/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fff80..0x9fffd8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fff80_0 {
    char padding_0[152];
    struct st_9fff80_1 *field_98;
} st_9fff80_0;

typedef struct st_9fff80_1 {
    char padding_0[48];
    long long field_30;
    char padding_38[8];
    long long field_40;
} st_9fff80_1;


void sub_9fff80(st_9fff80_0 *a0)
{
    long long *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_98;
    if (!v2)
        return;
    sub_a6c2e4(v2[8], "crypto/dh/dh_pmeth.c", 77);
    sub_9c3580(v2[6]);
    sub_a6c2e4();
    return;
}
