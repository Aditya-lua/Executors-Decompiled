/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2f25c..0xb2f340 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2f25c_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
} st_b2f25c_0;


st_b2f25c_0 * sub_b2f25c(st_b2f25c_0 *a0)
{
    st_b2f25c_0 *v2;  // x19
    st_b2f25c_0 *ptr;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(64, "providers/implementations/kdfs/krb5kdf.c", 67);
    if (!v2)
        return v2;
    ptr = v2;
    ptr->field_0 = a0->field_0;
    if (sub_afe694(a0->field_20, a0->field_28, &ptr->field_20, &ptr->field_28) && sub_afe694(a0->field_30, a0->field_38, &ptr->field_30, &ptr->field_38) && sub_afde10(&ptr->field_8, &a0->field_8))
        return ptr;
    sub_afdddc(&ptr->field_8);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/krb5kdf.c", 89);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/krb5kdf.c", 90);
    memset(ptr, 0, 64);
    ptr->field_0 = ptr->field_0;
    sub_a6c2e4(ptr, "providers/implementations/kdfs/krb5kdf.c", 79);
    return 0;
}
