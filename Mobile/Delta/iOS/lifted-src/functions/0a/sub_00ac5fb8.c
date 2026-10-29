/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac5fb8..0xac60ec (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac5fb8_3 {
    char padding_0[160];
    struct st_ac5fb8_0 *field_a0;
    struct st_ac5fb8_1 *field_a8;
} st_ac5fb8_3;

typedef struct st_ac5fb8_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac5fb8_0;

typedef struct st_ac5fb8_1 {
    char padding_0[56];
    struct st_ac5fb8_2 *field_38;
} st_ac5fb8_1;

typedef struct st_ac5fb8_2 {
    unsigned long long field_0;
} st_ac5fb8_2;


unsigned long long sub_ac5fb8(st_ac5fb8_3 **a0, unsigned long a1, unsigned long a2, unsigned int a3, unsigned long a4, unsigned long a5, long long a6)
{
    unsigned long long v3;  // x0
    char v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a3)
    {
        v3 = sub_a6e830(a6, *a0->field_a0->field_10, &v0);
        if (!(unsigned int)v3)
            return v3;
        *a0->field_a8->field_38();
    }
}
