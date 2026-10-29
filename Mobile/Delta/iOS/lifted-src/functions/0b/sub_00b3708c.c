/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3708c..0xb3711c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3708c_1 {
    struct st_b3708c_0 *field_0;
    char padding_8[40];
    unsigned int field_30;
} st_b3708c_1;

typedef struct st_b3708c_0 {
    char padding_0[80];
    long long field_50;
} st_b3708c_0;


long long sub_b3708c(st_b3708c_1 *a0, st_b3708c_0 *a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1->field_50)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ml_kem_kem.c", 92, "ml_kem_decapsulate_init");
        sub_a36abc(57, 128, 0);
        return 0;
    }
    else if (sub_a2f9e0())
    {
        a0->field_0 = a1;
        a0->field_30 = 0x2000;
    }
    else
    {
        return 0;
    }
}
