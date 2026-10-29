/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01610..0xb01674 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01610_0 {
    char padding_0[8];
    struct st_b01610_1 *field_8;
} st_b01610_0;

typedef struct st_b01610_1 {
    unsigned long long field_0;
} st_b01610_1;


void sub_b01610(st_b01610_0 *a0, unsigned long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return;
    (*(long long *)&a0->field_8[1])();
}
