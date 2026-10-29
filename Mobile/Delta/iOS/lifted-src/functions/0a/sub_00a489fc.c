/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa489fc..0xa48a4c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a489fc_0 {
    char padding_0[384];
    unsigned long long field_180;
} st_a489fc_0;


int sub_a489fc(unsigned long a0, long long a1)
{
    st_a489fc_0 *v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    v2->field_180 = 0;
    sub_9fc26c(a1, v2);
    sub_9fc26c(a1 + 8, &v2->padding_0[128]);
    sub_9fc26c(a1 + 16, &v2->padding_0[0x100]);
    return 1;
}
