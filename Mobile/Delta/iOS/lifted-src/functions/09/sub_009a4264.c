/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a4264..0x9a433c (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a4264_0 {
    char padding_0[736];
    struct st_9a4264_1 *field_2e0;
} st_9a4264_0;

typedef struct st_9a4264_1 {
    unsigned long long field_0;
} st_9a4264_1;

typedef struct st_9a4264_2 {
    char padding_0[8];
    struct st_9a4264_0 *field_8;
    char padding_10[1188];
    struct st_9a4264_1 *field_4b4;
} st_9a4264_2;


int sub_9a4264(st_9a4264_2 *a0, unsigned long a1)
{
    unsigned long long *v5;  // w8
    st_9a4264_0 *v6;  // x9
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = (unsigned long long *)*(int *)&(a0->padding_10)[1];
    v6 = a0->field_8;
    *(unsigned int *)&(a0->padding_10)[1] = 0;
    if (!v5)
        return 2;
    v0 = v7;
    v1 = v8;
    v2 = &v4;
    v3 = v9;
    if (!v6->field_2e0)
        return 2;
    v6->field_2e0();
}
