/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4aec..0x1b4c20 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b4aec_0 {
    char field_0;
} st_1b4aec_0;

extern char g_10002b0;

long long sub_1b4aec(long long a0, long long a1)
{
    long long v11;  // x19
    long long v12;  // x0
    long long v13;  // x0
    long long v0;  // [bp-0xb0], Other Possible Types: unsigned long
    st_1b4aec_0 **v1;  // [bp-0xa8], Other Possible Types: char
    st_1b4aec_0 *v2;  // [bp-0xa0]
    st_1b4aec_0 *v3;  // [bp-0x90], Other Possible Types: char
    st_1b4aec_0 **v4;  // [bp-0x88], Other Possible Types: char
    st_1b4aec_0 **v5;  // [bp-0x80], Other Possible Types: char
    char *v6;  // [bp-0x60]
    long long v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v2 = &v1;
    v0 = 0;
    v1 = &v2;
    v6 = &v5;
    v5 = &v6;
    v0 = _fcntl(a1, 3) | 4;
    _fcntl(a1, 4);
    v4 = (char)&(int)a1;
    sub_1c091c(&v5, &v4, &v3);
    v3 = &v4;
    v4 = &v3;
    sub_159d9c(&v6, &v5);
    v7 = 1;
    sub_181a8(&v5);
    if (sub_960338(a0, &v5, 1))
        v11 = 0;
    else
        v11 = sub_9625a4(a0, 0) == 6;
    sub_1b3f74(&v6);
    if (*(long long *)&g_10002b0 == v8)
        return v11;
    v12 = ___stack_chk_fail();
    sub_1b3f74(&v6);
    v13 = __Unwind_Resume(v12);
    __Unwind_Resume(v13);
}
