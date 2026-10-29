/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3732c..0xb3737c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3732c_0 {
    unsigned long long field_0;
    struct st_b3732c_0 *field_8;
    struct st_b3732c_0 *field_10;
} st_b3732c_0;


st_b3732c_0 * sub_b3732c(long long a0)
{
    st_b3732c_0 *v2;  // x0
    st_b3732c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(24, "providers/implementations/kem/mlx_kem.c", 42);
    if (!v2)
        return v2;
    v3 = v2;
    v3->field_0 = sub_9f2aec(a0);
    v3->field_8 = 0;
    *(unsigned int *)&v3->field_10 = 0;
    return v3;
}
