/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d3434..0x9d3494 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d3434_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[24];
    struct st_9d3434_0 *field_28;
    struct st_9d3434_0 *field_30;
    char padding_38[8];
    struct st_9d3434_0 *field_40;
} st_9d3434_0;


int sub_9d3434(st_9d3434_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_9d3434_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a6c2e4(a0->field_40->field_8, "crypto/bio/bf_readbuff.c", 79);
        sub_a6c2e4(a0->field_40, "crypto/bio/bf_readbuff.c", 80);
        a0->field_40 = 0;
        *(unsigned int *)&a0->field_28 = 0;
        v8 = 1;
        *(unsigned int *)&a0->field_30 = 0;
        a0 = 1;
    }
    return (unsigned int)a0;
}
