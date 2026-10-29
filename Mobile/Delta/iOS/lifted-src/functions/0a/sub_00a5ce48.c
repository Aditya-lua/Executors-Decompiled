/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ce48..0xa5ce78 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5ce48_1 {
    unsigned int field_0;
    unsigned int field_4;
} st_a5ce48_1;

typedef struct st_a5ce48_0 {
    char padding_0[96];
    unsigned long long field_60;
    struct st_a5ce48_1 *field_68;
} st_a5ce48_0;


void sub_a5ce48(unsigned int a0, unsigned int a1, long long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a5ce48_0 *v8;  // x0
    unsigned long long v9;  // x1
    unsigned int *v10;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_c4c40(a2);
    v9 = v8->field_60;
    v10 = &v8->field_68->field_0;
    *v10 = a0;
    v10[1] = a1;
    goto *((void *)(v9));
}
