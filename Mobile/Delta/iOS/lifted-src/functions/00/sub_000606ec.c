/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x606ec..0x60764 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_606ec_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_606ec_1;

typedef struct st_606ec_0 {
    char field_0;
} st_606ec_0;


long long sub_606ec(st_606ec_1 *a0)
{
    unsigned long long t;  // x0
    st_606ec_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_606ec_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(sub_60768(a0->field_0, 5) & 1))
    {
        t = std::__1::chrono::system_clock::now();
        return (long long)(t - a0->field_8) > (long long)(1000000 * a0->field_10);
    }
    return 1;
}
