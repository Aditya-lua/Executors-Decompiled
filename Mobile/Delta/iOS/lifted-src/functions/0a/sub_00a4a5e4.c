/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4a5e4..0xa4a694 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4a5e4_0 {
    char padding_0[128];
    struct st_a4a5e4_1 *field_80;
    struct st_a4a5e4_1 *field_88;
} st_a4a5e4_0;

typedef struct st_a4a5e4_1 {
    unsigned long long field_0;
} st_a4a5e4_1;


int sub_a4a5e4(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned int v2;  // w0
    st_a4a5e4_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50638();
    v3 = sub_9ffdd8(a0);
    if (a3 < v2)
    {
        return 1;
    }
    else if (v3->field_88)
    {
        sub_a50720(a0);
        v3->field_88();
    }
    else
    {
        v3->field_80();
    }
}
