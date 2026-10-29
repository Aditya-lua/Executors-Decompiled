/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b334..0xa7b380 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7b334_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_a7b334_0 *field_18;
} st_a7b334_0;


void sub_a7b334(st_a7b334_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return;
    }
    else if (a0->field_18)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        a0->field_0 = "Start";
        a0->field_8 = a1;
        a0->field_10 = a2;
        sub_a7b248();
        goto *((void *)(a0->field_18));
    }
    else
    {
        return;
    }
}
