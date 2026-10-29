/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x233a94..0x233bc8 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_233a94_0 {
    char field_0;
} st_233a94_0;

typedef struct st_233a94_1 {
    char padding_0[257];
    char field_101;
} st_233a94_1;

typedef struct st_233a94_2 {
    char padding_0[96];
    struct st_233a94_1 *field_60;
} st_233a94_2;

extern st_233a94_2 *g_f0d198;

unsigned long long sub_233a94(long long a0)
{
    unsigned long long v9;  // x0
    unsigned long v10;  // x1
    long long v12;  // x0
    long long v13;  // x0
    st_233a94_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_233a94_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    long long v3;  // [bp-0x58]
    st_233a94_0 **v4;  // [bp-0x50], Other Possible Types: char, unsigned long long
    char *v5;  // [bp-0x38]
    char *v6;  // [bp-0x30], Other Possible Types: uint128_t, unsigned long long
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v6 = &v4;
    v4 = &v6;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v9 = sub_234774(a0, 1);
        if (v9 && *(long long *)(v9 + 24))
        {
            v4 = 0;
            v6 = _INSERT(CONCAT(v6, 0), 0, &v5);
            v5 = &v6;
            v2 = *(long long *)(v9 + 24);
            v3 = 1;
            std::__1::mutex::lock(v2);
            if (!(sub_e6a04(v2 + 219, 1, 4) & 1))
            {
                v10 = v2 + 64;
                v6 = v4;
                sub_60b78(sub_61070(&v6, v10), v10);
            }
            sub_63c20(&v2);
            if (v4)
                sub_6aed4(v4, 1000, "Normal closure");
            sub_60b78(&v4);
            return 0;
        }
    }
    v12 = sub_c60e2c(a0);
    sub_60b78(&v4);
    v13 = __Unwind_Resume(v12);
    sub_60b78(&v4);
    __Unwind_Resume(v13);
}
