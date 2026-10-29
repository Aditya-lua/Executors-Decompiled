/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32b84..0xa32c08 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a32b84_0 {
    char padding_0[152];
    char field_98;
} st_a32b84_0;


int sub_a32b84(void)
{
    st_a32b84_0 *v2;  // x0
    st_a32b84_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3355c();
    if (!v2)
        return 1;
    do
    {
        if (!(v2->field_98 >> 3 & 1))
        {
            v3 = v2;
            sub_a34e98();
            sub_a350c0(v3);
            sub_a3562c(v3);
            sub_a35244(v3);
            sub_a3501c(v3);
            sub_a352e8(v3);
            sub_a35594(v3);
            sub_a35380(v3);
            sub_a34ac0(v3);
        }
    } while ((v2 = sub_a33620(), v2));
    return 1;
}
