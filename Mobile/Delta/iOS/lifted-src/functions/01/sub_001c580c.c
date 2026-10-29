/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c580c..0x1c59dc (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c580c_1 {
    struct st_1c580c_0 *field_0;
} st_1c580c_1;

typedef struct st_1c580c_0 {
    char field_0;
} st_1c580c_0;


unsigned long long sub_1c580c(long long a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v7;  // x21
    long long v8;  // x24
    unsigned long v0;  // [bp-0x80], Other Possible Types: unsigned long long
    st_1c580c_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_1c580c_0 *v2;  // [bp-0x68]
    st_1c580c_0 *v3;  // [bp-0x60], Other Possible Types: st_1c580c_1 **
    st_1c580c_0 **v4;  // [bp-0x58], Other Possible Types: st_1c580c_1 **, char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    std::__1::mutex::lock(a2);
    v7 = sub_95e294(a1);
    std::__1::mutex::unlock(a2);
    if (!v7)
        return v7;
    v3 = &v4;
    v4 = &v3;
    v0 = 0;
    v0 = _fcntl(a0, 3) | 4;
    _fcntl(a0, 4);
    v8 = sub_9d8f84(a0, 0);
    sub_9d46fc(v8, 0x66, 1, 0);
    sub_95f514(v7, v8, v8);
    v3 = &v4;
    v4 = &v3;
    sub_95f0c4(v7, 55, 0, sub_a0c8(a4 + 8));
    if (!(sub_1c2d20(a3, v7) & 1))
    {
        sub_9607a0(v7);
        std::__1::mutex::lock(a2);
        sub_95eea4(v7);
        std::__1::mutex::unlock(a2);
        v4 = &v3;
        v3 = &v4;
        v0 = 0;
        v0 = _fcntl(a0, 3) & 0xfffffffb;
        _fcntl(a0, 4);
        return 0;
    }
    sub_9d46fc(v8, 0x66, 0, 0);
    v3 = &v4;
    v4 = &v3;
    v0 = 0;
    v0 = _fcntl(a0, 3) & 0xfffffffb;
    _fcntl(a0, 4);
    return v7;
}
