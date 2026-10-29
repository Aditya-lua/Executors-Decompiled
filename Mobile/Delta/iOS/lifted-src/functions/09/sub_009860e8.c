/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9860e8..0x986164 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9860e8_0 {
    char padding_0[44];
    struct st_9860e8_0 *field_2c;
    char padding_34[28];
    struct st_9860e8_0 *field_50;
    struct st_9860e8_0 *field_58;
} st_9860e8_0;


void sub_9860e8(st_9860e8_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_9860e8_0 **v12;  // x20
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_987c0c();
    v12 = &a0->padding_34[24];
    if (*(int *)&(a0->padding_0)[1])
        sub_a6c4e8(*(long long *)&a0->padding_34[24], a0->field_50, "include/internal/ring_buf.h", 58);
    else
        sub_a6c2e4(*(long long *)&a0->padding_34[24], "include/internal/ring_buf.h", 60);
    *v12 = 0;
    v12[1] = 0;
    sub_a6c2e4();
    return;
}
