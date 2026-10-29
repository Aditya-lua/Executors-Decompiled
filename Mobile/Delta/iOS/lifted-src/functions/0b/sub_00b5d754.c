/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d754..0xb5d888 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5d754_1 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    char padding_18[56];
    unsigned int field_50;
    char field_54;
    char field_55;
    char padding_56[154];
    struct st_b5d754_2 *field_f0;
} st_b5d754_1;

typedef struct st_b5d754_0 {
    unsigned long long field_0;
} st_b5d754_0;

typedef struct st_b5d754_2 {
    struct st_b5d754_0 *field_0;
} st_b5d754_2;


int sub_b5d754(st_b5d754_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, long long n, unsigned long a5, char a6)
{
    unsigned long long v2;  // 4109
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    a0->field_54 = a0->field_54 & 254 | a6 & 1;
    if (a3)
    {
        v2 = arm64g_calculate_condition(130, n - 129, 129, 0);
        if (!(v2 & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", 62, "gcm_init");
            sub_a36abc(57, 109, 0);
            return 0;
        }
        a0->field_10 = n;
        _memcpy(&a0->field_55, a3, n);
        a0->field_50 = 1;
    }
    if (a1)
    {
        if (a0->field_8 == a2)
            (*(long long *)a0->field_f0)();
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon_gcm.c", 72, "gcm_init");
        sub_a36abc(57, 105, 0);
        return 0;
    }
}
