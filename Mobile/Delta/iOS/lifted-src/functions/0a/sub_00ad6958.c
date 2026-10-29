/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad6958..0xad69e4 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad6958_0 {
    int field_0;
    char field_1;
    char padding_2[6];
    struct st_ad6958_1 *field_8;
} st_ad6958_0;

typedef struct st_ad6958_1 {
    struct st_ad6958_0 *field_0;
} st_ad6958_1;


void sub_ad6958(st_ad6958_0 *a0, unsigned long long *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_ad6958_0 *v12;  // x21
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
    if (a0->field_0 >= 1)
    {
        v12 = 0;
        do
        {
            if (*(long long *)(*(long long *)&a0->padding_2[3] + v12 * 8))
                a1();
        } while ((v12 = (char *)&v12->field_0 + 1, a0->field_0 > v12));
    }
    sub_a6c2e4(*(long long *)&a0->padding_2[3], "crypto/stack/stack.c", 448);
    sub_a6c2e4();
    return;
}
