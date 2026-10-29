/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77ccc..0x77e64 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_77ccc_0 {
    char field_0;
} st_77ccc_0;


long long sub_77ccc(unsigned long long *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long *v4;  // x1
    unsigned long long v5;  // x12
    unsigned long long v6;  // x14
    unsigned long long v7;  // x13
    unsigned long long *iter;  // x1
    unsigned long v9;  // x16
    unsigned long v10;  // x15
    unsigned long v11;  // x0
    unsigned long v12;  // x17
    st_77ccc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_77ccc_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v1 = &v0;
    v0 = &v1;
    if (!a0 || a1 < 32)
        return sub_77bd4(a2 + 2870177450012600261 + a1);
    v5 = a2 + 6983438078262162902;
    v6 = a2 + 14029467366897019727;
    v7 = a2 + 7046029288634856825;
    iter = v4;
    do
    {
        v9 = __ROL__(v5 + 14029467366897019727 * *iter, 31);
        v5 = 11400714785074694791 * v9;
        v10 = __ROL__(v6 + 14029467366897019727 * iter[1], 31);
        v6 = 11400714785074694791 * v10;
        v11 = __ROL__(a2 + 14029467366897019727 * iter[2], 31);
        a2 = 11400714785074694791 * v11;
        v12 = __ROL__(v7 + 14029467366897019727 * iter[3], 31);
        v7 = 11400714785074694791 * v12;
        iter += 4;
    } while (iter < (char *)v4 + a1 - 31);
    return sub_77bd4(...);
    return sub_77bd4(a2 + 2870177450012600261 + a1);
}
