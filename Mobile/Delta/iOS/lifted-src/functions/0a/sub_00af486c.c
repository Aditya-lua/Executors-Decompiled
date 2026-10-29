/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf486c..0xaf4988 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af486c_0 {
    char padding_0[72];
    struct st_af486c_1 *field_48;
} st_af486c_0;

typedef struct st_af486c_1 {
    unsigned long long field_0;
} st_af486c_1;


unsigned long long sub_af486c(long long *a0, st_af486c_0 *a1, long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x19
    unsigned long long v5;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_97725c(a2);
    v3 = sub_af2c74(v2);
    *a0 = 0;
    if (!v3)
        return 0xffffffff;
    v4 = v3;
    v5 = sub_af2ca0(a1, 1, v2, v4);
    if ((unsigned int)v5 != 1)
    {
        sub_af2a9c(v4);
        return v5;
    }
    a1->field_48();
}
