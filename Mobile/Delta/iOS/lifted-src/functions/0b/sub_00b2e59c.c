/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e59c..0xb2e72c (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2e59c_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b2e59c_1 *field_10;
    unsigned int field_18;
    char padding_1c[4];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    char padding_60[8];
    unsigned int field_68;
} st_b2e59c_1;

typedef struct st_b2e59c_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
    long long field_50;
    long long field_58;
    double field_60;
    unsigned int field_68;
} st_b2e59c_0;


st_b2e59c_1 * sub_b2e59c(st_b2e59c_0 *a0)
{
    st_b2e59c_1 *ptr;  // x19
    st_b2e59c_1 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    ptr = sub_a6bffc(112, "providers/implementations/kdfs/kbkdf.c", 121);
    if (!ptr)
        return ptr;
    ptr->field_0 = a0->field_0;
    ptr->field_18 = 32;
    ptr->field_68 = 1;
    *(double *)ptr->padding_60 = 5e-324;
    v3 = sub_a57f5c(a0->field_10);
    ptr->field_10 = v3;
    if (v3 && sub_afe694(a0->field_20, a0->field_28, &ptr->field_20, &ptr->field_28) && sub_afe694(a0->field_30, a0->field_38, &ptr->field_30, &ptr->field_38) && sub_afe694(a0->field_40, a0->field_48, &ptr->field_40, &ptr->field_48) && sub_afe694(a0->field_50, a0->field_58, &ptr->field_50, &ptr->field_58))
    {
        ptr->field_8 = a0->field_8;
        ptr->field_18 = a0->field_18;
        ptr->field_68 = a0->field_68;
        *(double *)ptr->padding_60 = a0->field_60;
        return ptr;
    }
    sub_a57f0c(ptr->field_10);
    sub_a6c4e8(ptr->field_40, ptr->field_48, "providers/implementations/kdfs/kbkdf.c", 147);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/kbkdf.c", 148);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/kbkdf.c", 149);
    sub_a6c4e8(ptr->field_50, ptr->field_58, "providers/implementations/kdfs/kbkdf.c", 150);
    memset(ptr, 0, 112);
    ptr->field_0 = ptr->field_0;
    ptr->field_18 = 32;
    ptr->field_68 = 1;
    *(double *)ptr->padding_60 = 5e-324;
    sub_a6c2e4(ptr, "providers/implementations/kdfs/kbkdf.c", 137);
    return 0;
}
