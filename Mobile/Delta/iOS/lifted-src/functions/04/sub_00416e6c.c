/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x416e6c..0x416ed4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_416e6c_0 {
    char field_0;
} st_416e6c_0;

extern unsigned long long g_404a5c;
extern char g_404a7d;
extern char g_8094fa;

void sub_416e6c(void)
{
    unsigned long long v7;  // x30
    st_416e6c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_416e6c_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_404a5c;
    v3 = ~&g_404a7d + &g_8094fa;
    v3();
}
