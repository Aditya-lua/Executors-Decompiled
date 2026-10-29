/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb374..0xaeb40c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb374_0 {
    char padding_0[256];
    long long field_100;
} st_aeb374_0;


unsigned long long sub_aeb374(long long a0, st_aeb374_0 *a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ab1c50();
    if (sub_af1860(v2, sub_97725c(a1)))
        return 29;
    if (!sub_aea7f4(a0) || !sub_aea7f4(a1))
        return 1;
    v3 = sub_aeb17c(a0, a1->field_100);
    if ((unsigned int)v3)
        return v3;
    sub_af1e94(a0);
    return 1;
}
