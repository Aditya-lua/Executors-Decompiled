/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb07c28..0xb07c98 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b07c28_2 {
    char padding_0[168];
    struct st_b07c28_0 *field_a8;
} st_b07c28_2;

typedef struct st_b07c28_0 {
    char padding_0[24];
    struct st_b07c28_1 *field_18;
} st_b07c28_0;

typedef struct st_b07c28_1 {
    unsigned long long field_0;
} st_b07c28_1;


long long sub_b07c28(st_b07c28_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned int v2;  // w20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b5ba3c();
    if (a3 && v2)
        a0->field_a8->field_18();
    if (!v2)
    {
        return 0;
    }
    else if (!sub_b07b30())
    {
        return 0;
    }
    else
    {
        return v2;
    }
}
