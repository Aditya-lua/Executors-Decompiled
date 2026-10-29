/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x686e0..0x687d8 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_686e0_0 {
    char field_0;
} st_686e0_0;


long long sub_686e0(void* a0, long long a1, long long a2)
{
    unsigned long long v4;  // x20
    unsigned int v5;  // w0
    unsigned long v6;  // x20
    st_686e0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_686e0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(a0 + 248);
    if ((long long)a0[88] && (long long)a0[96])
    {
        sub_a35af4();
        v4 = sub_960734((long long)a0[88], a1, a2);
        v5 = sub_9625a4((long long)a0[88], v4);
        if (v5)
        {
            if ((v5 & 0xfffffffe) == 2)
                *(unsigned int *)___error() = 35;
            v6 = 0xffffffffffffffff;
        }
        else
        {
            v6 = (int)v4;
        }
    }
    else
    {
        v6 = 0;
    }
    std::__1::mutex::unlock(a0 + 248);
    return v6;
}
