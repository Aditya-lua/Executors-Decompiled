/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x234c6c..0x2350ec (1152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_234c6c_0 {
    char field_0;
} st_234c6c_0;

typedef struct st_234c6c_1 {
    char padding_0[257];
    char field_101;
} st_234c6c_1;

typedef struct st_234c6c_2 {
    char padding_0[96];
    struct st_234c6c_1 *field_60;
} st_234c6c_2;

extern unsigned long long g_e79ed8;
extern st_234c6c_2 *g_f0d198;
extern char g_10002b0;

unsigned long long sub_234c6c(unsigned long a0, unsigned long long *a1)
{
    unsigned long long v8;  // w8
    unsigned long long v9;  // x9
    unsigned long long v10;  // x8
    unsigned long long v11;  // x0
    long long v12;  // x0
    st_234c6c_0 *v0;  // [bp-0x1b0]
    unsigned long v1;  // [bp-0x178]
    unsigned long long v2;  // [bp-0x170]
    unsigned long v3;  // [bp-0x168]
    st_234c6c_0 **v4;  // [bp-0x150], Other Possible Types: char
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    sub_614bc();
    if (v3)
    {
        v0 = &v4;
        v4 = &v0;
        v1 = v3;
        v2 = 1;
        std::__1::mutex::lock(v3);
        if (!(sub_60768(v3 + 217, 2) & 1) && g_f0d198->field_60->field_101 >> 2 & 1)
        {
            v8 = *(int *)*a1;
            v9 = 8;
            if (v8 == 1)
                v9 = 96;
            if (!v8)
                v9 = 224;
            if (v8 == 3)
                v9 = 152;
            v10 = 160;
            if (v8 == 2)
                v9 = v10;
            goto *((void *)(*(long long *)((char *)&g_e79ed8 + v9)));
        }
        sub_63c20(&v1);
    }
    v11 = sub_60b78(&v3);
    if (*(long long *)&g_10002b0 == v5)
        return v11;
    ___stack_chk_fail();
    sub_63c20(&v1);
    sub_60b78(&v3);
    v12 = __Unwind_Resume(a1);
    sub_60b78(&v3);
    __Unwind_Resume(v12);
}
