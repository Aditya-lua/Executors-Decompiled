/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3711c..0xb371e8 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3711c_1 {
    unsigned long long field_0;
} st_b3711c_1;

typedef struct st_b3711c_0 {
    char padding_0[80];
    struct st_b3711c_1 *field_50;
} st_b3711c_0;


unsigned long long * sub_b3711c(st_b3711c_0 **a0, unsigned long long *a1, unsigned long long *a2, unsigned long a3, unsigned long a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0->field_50)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 233, "ml_kem_decapsulate");
        sub_a36abc(57, 128, 0);
        return 0;
    }
    else if (a1)
    {
        if (a2)
        {
            if (31 >= *a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 248, "ml_kem_decapsulate");
                sub_a36abc(57, 106, "shared-secret buffer too small");
                return 0;
            }
            *a2 = 32;
        }
    }
    else
    {
        if (!a2)
            return 0;
        *a2 = 32;
        return 1;
    }
}
