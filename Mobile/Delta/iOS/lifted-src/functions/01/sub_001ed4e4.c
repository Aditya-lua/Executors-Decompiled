/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ed4e4..0x1ed704 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ed4e4_0 {
    char field_0;
} st_1ed4e4_0;


unsigned long long sub_1ed4e4(void* a0)
{
    unsigned long long i;  // x20
    unsigned long long v6;  // x0
    void* v7;  // x8
    uint128_t v8;  // q0
    unsigned long j;  // x9
    unsigned long v10;  // x9
    st_1ed4e4_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_1ed4e4_0 *v1;  // [bp-0x30]
    char v2;  // [bp-0x21]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0[8])
    {
        i = 0;
        do
        {
            v2 = *(int *)(*(long long *)a0 + i * 4);
            sub_1f0698(a0 + 48, &v2, 1);
            i += 1;
        } while (i < (unsigned long long)(long long)a0[8]);
    }
    v6 = sub_1fa874(a0 + 48);
    v7 = (long long)a0[24];
    v8 = CONCAT((long long)a0[56], (long long)a0[56]);
    *(uint128_t *)v7 = v8;
    *(uint128_t *)&v7[16] = v8;
    *(uint128_t *)&v7[32] = v8;
    *(uint128_t *)&v7[48] = v8;
    *(uint128_t *)&v7[64] = v8;
    *(uint128_t *)&v7[80] = v8;
    *(uint128_t *)&v7[96] = v8;
    *(uint128_t *)&v7[112] = v8;
    *(uint128_t *)&v7[128] = v8;
    *(uint128_t *)&v7[144] = v8;
    *(uint128_t *)&v7[160] = v8;
    *(uint128_t *)&v7[176] = v8;
    *(uint128_t *)&v7[192] = v8;
    *(uint128_t *)&v7[208] = v8;
    *(uint128_t *)&v7[224] = v8;
    *(uint128_t *)&v7[240] = v8;
    *(uint128_t *)&v7[0x100] = v8;
    *(uint128_t *)&v7[272] = v8;
    *(uint128_t *)&v7[288] = v8;
    *(uint128_t *)&v7[304] = v8;
    *(uint128_t *)&v7[320] = v8;
    *(uint128_t *)&v7[336] = v8;
    *(uint128_t *)&v7[352] = v8;
    *(uint128_t *)&v7[368] = v8;
    *(uint128_t *)&v7[384] = v8;
    *(uint128_t *)&v7[400] = v8;
    *(uint128_t *)&v7[416] = v8;
    *(uint128_t *)&v7[432] = v8;
    *(uint128_t *)&v7[448] = v8;
    *(uint128_t *)&v7[464] = v8;
    *(uint128_t *)&v7[480] = v8;
    *(uint128_t *)&v7[496] = v8;
    *(uint128_t *)&v7[0x200] = v8;
    *(uint128_t *)&v7[528] = v8;
    *(uint128_t *)&v7[544] = v8;
    *(uint128_t *)&v7[560] = v8;
    *(uint128_t *)&v7[576] = v8;
    *(uint128_t *)&v7[592] = v8;
    *(uint128_t *)&v7[608] = v8;
    *(uint128_t *)&v7[624] = v8;
    *(uint128_t *)&v7[640] = v8;
    *(uint128_t *)&v7[656] = v8;
    *(uint128_t *)&v7[672] = v8;
    *(uint128_t *)&v7[688] = v8;
    *(uint128_t *)&v7[704] = v8;
    *(uint128_t *)&v7[720] = v8;
    *(uint128_t *)&v7[736] = v8;
    *(uint128_t *)&v7[752] = v8;
    *(uint128_t *)&v7[0x300] = v8;
    *(uint128_t *)&v7[784] = v8;
    *(uint128_t *)&v7[800] = v8;
    *(uint128_t *)&v7[816] = v8;
    *(uint128_t *)&v7[832] = v8;
    *(uint128_t *)&v7[848] = v8;
    *(uint128_t *)&v7[864] = v8;
    *(uint128_t *)&v7[880] = v8;
    *(uint128_t *)&v7[896] = v8;
    *(uint128_t *)&v7[912] = v8;
    *(uint128_t *)&v7[928] = v8;
    *(uint128_t *)&v7[944] = v8;
    *(uint128_t *)&v7[960] = v8;
    *(uint128_t *)&v7[976] = v8;
    *(uint128_t *)&v7[992] = v8;
    *(uint128_t *)&v7[1008] = v8;
    *(uint128_t *)&v7[0x400] = v8;
    *(uint128_t *)&v7[1040] = v8;
    *(uint128_t *)&v7[1056] = v8;
    *(uint128_t *)&v7[1072] = v8;
    *(uint128_t *)&v7[1088] = v8;
    *(uint128_t *)&v7[1104] = v8;
    *(uint128_t *)&v7[1120] = v8;
    *(uint128_t *)&v7[1136] = v8;
    *(uint128_t *)&v7[1152] = v8;
    *(uint128_t *)&v7[1168] = v8;
    *(uint128_t *)&v7[1184] = v8;
    *(uint128_t *)&v7[1200] = v8;
    *(uint128_t *)&v7[1216] = v8;
    *(uint128_t *)&v7[1232] = v8;
    *(uint128_t *)&v7[1248] = v8;
    *(uint128_t *)&v7[1264] = v8;
    *(uint128_t *)&v7[0x500] = v8;
    *(uint128_t *)&v7[1296] = v8;
    *(uint128_t *)&v7[1312] = v8;
    *(uint128_t *)&v7[1328] = v8;
    *(uint128_t *)&v7[1344] = v8;
    *(uint128_t *)&v7[1360] = v8;
    *(uint128_t *)&v7[1376] = v8;
    *(uint128_t *)&v7[1392] = v8;
    *(uint128_t *)&v7[1408] = v8;
    *(uint128_t *)&v7[1424] = v8;
    *(uint128_t *)&v7[1440] = v8;
    *(uint128_t *)&v7[1456] = v8;
    *(uint128_t *)&v7[1472] = v8;
    *(uint128_t *)&v7[1488] = v8;
    *(uint128_t *)&v7[1504] = v8;
    *(uint128_t *)&v7[1520] = v8;
    *(uint128_t *)&v7[0x600] = v8;
    *(uint128_t *)&v7[1552] = v8;
    *(uint128_t *)&v7[1568] = v8;
    *(uint128_t *)&v7[1584] = v8;
    *(uint128_t *)&v7[1600] = v8;
    *(uint128_t *)&v7[1616] = v8;
    *(uint128_t *)&v7[1632] = v8;
    *(uint128_t *)&v7[1648] = v8;
    *(uint128_t *)&v7[1664] = v8;
    *(uint128_t *)&v7[1680] = v8;
    *(uint128_t *)&v7[1696] = v8;
    *(uint128_t *)&v7[1712] = v8;
    *(uint128_t *)&v7[1728] = v8;
    *(uint128_t *)&v7[1744] = v8;
    *(uint128_t *)&v7[1760] = v8;
    *(uint128_t *)&v7[1776] = v8;
    *(uint128_t *)&v7[0x700] = v8;
    *(uint128_t *)&v7[1808] = v8;
    *(uint128_t *)&v7[1824] = v8;
    *(uint128_t *)&v7[1840] = v8;
    *(uint128_t *)&v7[1856] = v8;
    *(uint128_t *)&v7[1872] = v8;
    *(uint128_t *)&v7[1888] = v8;
    *(uint128_t *)&v7[1904] = v8;
    *(uint128_t *)&v7[1920] = v8;
    *(uint128_t *)&v7[1936] = v8;
    *(uint128_t *)&v7[1952] = v8;
    *(uint128_t *)&v7[1968] = v8;
    *(uint128_t *)&v7[1984] = v8;
    *(uint128_t *)&v7[2000] = v8;
    *(uint128_t *)&v7[2016] = v8;
    *(uint128_t *)&v7[2032] = v8;
    j = (long long)a0[56] - 1;
    if ((long long)a0[56] == 1)
        return v6;
    do
    {
        v10 = j;
        *(unsigned long *)((char *)v7 + 8 * *(char *)((long long)a0[48] + v10)) = v10;
        j = v10 - 1;
    } while (j);
    return v6;
}
