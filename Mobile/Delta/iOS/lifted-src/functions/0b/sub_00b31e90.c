/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb31e90..0xb31fac (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b31e90_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[23];
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    char field_40;
    char padding_41[7];
    long long field_48;
    long long field_50;
} st_b31e90_0;


st_b31e90_0 * sub_b31e90(st_b31e90_0 *a0)
{
    st_b31e90_0 *v2;  // x19
    st_b31e90_0 *ptr;  // x3
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(88, "providers/implementations/kdfs/sshkdf.c", 63);
    if (!v2)
        return v2;
    ptr = v2;
    ptr->field_0 = a0->field_0;
    if (sub_afe694(a0->field_20, a0->field_28, &ptr->field_20, &ptr->field_28) && sub_afe694(a0->field_30, a0->field_38, &ptr->field_30, &ptr->field_38) && sub_afe694(a0->field_48, a0->field_50, &ptr->field_48, &ptr->field_50) && sub_afe05c(&ptr->field_8, &a0->field_8))
    {
        ptr->field_40 = a0->field_40;
        return ptr;
    }
    sub_afe028(&ptr->field_8);
    sub_a6c4e8(ptr->field_20, ptr->field_28, "providers/implementations/kdfs/sshkdf.c", 86);
    sub_a6c4e8(ptr->field_30, ptr->field_38, "providers/implementations/kdfs/sshkdf.c", 87);
    sub_a6c4e8(ptr->field_48, ptr->field_50, "providers/implementations/kdfs/sshkdf.c", 88);
    memset(ptr, 0, 88);
    ptr->field_0 = ptr->field_0;
    sub_a6c2e4(ptr, "providers/implementations/kdfs/sshkdf.c", 76);
    return 0;
}
