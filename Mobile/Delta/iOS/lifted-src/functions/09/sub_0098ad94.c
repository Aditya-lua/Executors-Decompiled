/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98ad94..0x98af2c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98ad94_0 {
    char padding_0[24];
    struct st_98ad94_1 *field_18;
} st_98ad94_0;

typedef struct st_98ad94_2 {
    struct st_98ad94_0 *field_0;
    char padding_8[8];
    long long field_10;
    char padding_18[40];
    unsigned long long field_40;
    unsigned long long field_48;
} st_98ad94_2;

typedef struct st_98ad94_1 {
    unsigned long long field_0;
} st_98ad94_1;


unsigned long long sub_98ad94(st_98ad94_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_40)
        return 0xfffffffe;
    if (a0->field_48)
        return 0xfffffffe;
    sub_9d3d58(a0->field_10, 15);
    a0->field_0->field_18();
}
