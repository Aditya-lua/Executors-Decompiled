/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d7378..0x9d73d8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d7378_0 {
    char padding_0[40];
    struct st_9d7378_0 *field_28;
    struct st_9d7378_0 *field_2c;
    struct st_9d7378_0 *field_30;
    unsigned int field_38;
    char padding_3c[4];
    long long field_40;
} st_9d7378_0;


int sub_9d7378(st_9d7378_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (*(int *)((char *)&a0->field_28 + 4))
        {
            if ((int)a0->field_28)
                sub_9d66cc((int)a0->field_30);
            *(unsigned int *)&a0->field_28 = 0;
            *(unsigned int *)&a0->field_2c = 0;
        }
        sub_a6c2e4(*(long long *)&a0->field_38, "crypto/bio/bss_dgram.c", 293);
        a0 = 1;
    }
    return (unsigned int)a0;
}
