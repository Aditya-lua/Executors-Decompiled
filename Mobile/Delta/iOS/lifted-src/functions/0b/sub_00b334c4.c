/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb334c4..0xb335c8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b334c4_0 {
    unsigned long long field_0;
    struct st_b334c4_0 *field_8;
    struct st_b334c4_0 *field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    long long field_30;
} st_b334c4_0;


st_b334c4_0 * sub_b334c4(st_b334c4_0 *a0)
{
    st_b334c4_0 *ptr;  // x19
    st_b334c4_0 *v3;  // x0
    st_b334c4_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    ptr = sub_a6bffc(56, "providers/implementations/kdfs/tls1_prf.c", 120);
    if (!ptr)
        return ptr;
    ptr->field_0 = a0->field_0;
    if ((!a0->field_8 || (v3 = sub_a57f5c(a0->field_8), ptr->field_8 = v3, v3)) && (!a0->field_10 || (v4 = sub_a57f5c(a0->field_10), ptr->field_10 = v4, v4)) && sub_afe694(a0->field_18, a0->field_20, &ptr->field_18, &ptr->field_20) && sub_afe694(a0->field_28, a0->field_30, &ptr->field_28, &ptr->field_30))
        return ptr;
    sub_a57f0c(ptr->field_8);
    sub_a57f0c(ptr->field_10);
    sub_a6c4e8(ptr->field_18, ptr->field_20, "providers/implementations/kdfs/tls1_prf.c", 144);
    sub_a6c4e8(ptr->field_28, ptr->field_30, "providers/implementations/kdfs/tls1_prf.c", 145);
    memset(ptr, 0, 56);
    ptr->field_0 = ptr->field_0;
    sub_a6c2e4(ptr, "providers/implementations/kdfs/tls1_prf.c", 133);
    return 0;
}
