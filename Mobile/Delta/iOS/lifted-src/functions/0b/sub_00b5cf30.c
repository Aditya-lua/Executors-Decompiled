/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5cf30..0xb5d064 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5cf30_1 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[16];
    char field_30;
    char padding_31[95];
    struct st_b5cf30_2 *field_90;
} st_b5cf30_1;

typedef struct st_b5cf30_0 {
    unsigned long long field_0;
} st_b5cf30_0;

typedef struct st_b5cf30_2 {
    struct st_b5cf30_0 *field_0;
} st_b5cf30_2;


int sub_b5cf30(st_b5cf30_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, long long n, unsigned long a5, char a6)
{
    char v2;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = a0->field_0 & 0xfffffffe | a6 & 1;
    a0->field_0 = v2;
    if (a3)
    {
        if (15 - a0->field_8 == n)
        {
            _memcpy(&a0->field_30, a3, n);
            a0->field_0 = v2 | 4;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 0xee, "ccm_init");
            sub_a36abc(57, 109, 0);
            return 0;
        }
    }
    if (a1)
    {
        if (a0->field_18 == a2)
            (*(long long *)a0->field_90)();
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 246, "ccm_init");
        sub_a36abc(57, 105, 0);
        return 0;
    }
}
