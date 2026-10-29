/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb306d4..0xb307c8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b306d4_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
    unsigned int field_48;
} st_b306d4_0;

typedef struct st_b306d4_1 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    unsigned long long field_40;
    unsigned int field_48;
} st_b306d4_1;


st_b306d4_0 * sub_b306d4(st_b306d4_1 *a0)
{
    st_b306d4_0 *v2;  // x19
    st_b306d4_0 *ptr;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(80, "providers/implementations/kdfs/pkcs12kdf.c", 144);
    if (!v2)
        return v2;
    ptr = v2;
    ptr->field_0 = a0->field_0;
    if (sub_afe694(a0->field_30, a0->field_38, &ptr->field_30, &ptr->field_38) && sub_afe694(a0->field_20, a0->field_28, &ptr->field_20, &ptr->field_28) && sub_afe05c(&ptr->field_8, &a0->field_8))
    {
        ptr->field_40 = a0->field_40;
        ptr->field_48 = a0->field_48;
        return ptr;
    }
    sub_afe028(&ptr->field_8);
    sub_a6c2e4(ptr->field_30, "providers/implementations/kdfs/pkcs12kdf.c", 154);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/pkcs12kdf.c", 155);
    memset(ptr, 0, 80);
    sub_a6c2e4(ptr, "providers/implementations/kdfs/pkcs12kdf.c", 165);
    return 0;
}
