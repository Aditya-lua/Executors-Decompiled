/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x73134..0x731e8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_73134_0 {
    char padding_0[896];
    unsigned long long field_380;
} st_73134_0;

extern char g_10002b0;

unsigned long long sub_73134(st_73134_0 *a0, unsigned long a1)
{
    unsigned long long v5;  // x0
    char *v6;  // x8
    long long v7;  // x0
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v1 = 0;
    sub_749a8();
    v5 = sub_181a8(&v0);
    if (*v6 == 1)
    {
        a0->field_380 = std::__1::chrono::steady_clock::now(std::__1::mutex::lock(&a0->padding_0[832]));
        v5 = std::__1::mutex::unlock(&a0->padding_0[832]);
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    v7 = __Unwind_Resume(___stack_chk_fail());
    sub_181a8(&v0);
    __Unwind_Resume(v7);
}
