/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa41d14..0xa41dc8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a41d14_0 {
    char padding_0[256];
    struct st_a41d14_1 *field_100;
} st_a41d14_0;

typedef struct st_a41d14_1 {
    unsigned long long field_0;
} st_a41d14_1;


int sub_a41d14(long long a0, long long a1, long long a2, long long a3)
{
    st_a41d14_0 *v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (v2->field_100)
    {
        sub_a50720(a0);
        v2->field_100();
    }
    else if (sub_a50720(a0))
    {
        sub_a92d00(a2, a1, a3, v2);
        return 1;
    }
    else
    {
        sub_a92eec(a2, a1, a3, v2);
        return 1;
    }
}
