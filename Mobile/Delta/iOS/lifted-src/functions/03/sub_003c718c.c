/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c718c..0x3c72b4 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c718c_0 {
    char padding_0[80];
    long long field_50;
} st_3c718c_0;


long long sub_3c718c(st_3c718c_0 *a0)
{
    st_3c718c_0 *v10;  // x1
    long long v12;  // x0
    st_3c718c_0 *v13;  // x20
    unsigned long long *v14;  // x20
    long long count;  // x0
    uint128_t v0;  // [bp-0x80]
    st_3c718c_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    uint128_t v3;  // [bp-0x60], Other Possible Types: long long
    long long v4;  // [bp-0x58]
    char *v5;  // [bp-0x48]
    uint128_t v6;  // [bp-0x40], Other Possible Types: long long
    long long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    std::__1::mutex::lock(&a0[1].padding_0[64]);
    v3 = 0;
    v4 = 0;
    *(char ***)&v6 = &v5;
    v5 = &v6;
    v1 = a0;
    v2 = 1;
    std::__1::mutex::lock(a0);
    v10 = &a0->padding_0[64];
    v0 = v6;
    v6 = 0;
    v7 = 0;
    v3 = v0;
    sub_60b78(sub_61070(&v6, v10), v10);
    sub_63c20(&v1);
    v12 = *(unsigned long long *)&*(unsigned long long *)(void*)&v0;
    if (v12)
        sub_6aed4(v12, 1000, "Normal closure");
    v13 = a0;
    v14 = &v13->field_50;
    if (v13->field_50)
    {
        count = _pthread_self();
        if (sub_3c714c(v13->field_50, count))
            std::__1::thread::detach(v14);
        else
            std::__1::thread::join(v14);
    }
    sub_60b78(&v3);
    return std::__1::mutex::unlock(&a0[1].padding_0[64]);
}
